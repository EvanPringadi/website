let score = JSON.parse(localStorage.getItem('score')) || {
  wins: 0,
  losses: 0,
  ties: 0
};

updateScoreElement();

/* same as above since ||
if (!score) {
score = {
  wins: 0,
  losses: 0,
  ties: 0
};
}
*/

let confirmationMessageHTML = '';

function confirmationMessage() {
  confirmationMessageHTML = `
  <p>Are you sure want to reset the score?</p>
  <button class="js-reset-button">Yes</button>
  <button class="js-remove-confirmation-button">No</button>
  `;
  document.querySelector('.js-confirmation-message')
    .innerHTML = confirmationMessageHTML;

    document.querySelector('.js-reset-button')
    .addEventListener('click', () => {
      document.querySelector('.js-confirmation-message')
       .innerHTML = '';
      resetScore();
  });
  
  document.querySelector('.js-remove-confirmation-button')
    .addEventListener('click', () => {
      document.querySelector('.js-confirmation-message')
       .innerHTML = '';
  });
}

document.querySelector('.reset-score-button')
  .addEventListener('click', () => {
    confirmationMessage();
  });

function resetScore () {
  score.wins = 0;
  score.losses = 0;
  score.ties = 0;
  localStorage.removeItem('score');
  updateScoreElement();
}

let isAutoPlaying = false;
let intervalId;

// const autoPlay = () => {};

function autoPlay() {
  const autoplayText = document.querySelector('.auto-play-button');
  if (!isAutoPlaying) {
    autoplayText.innerHTML = 'Stop Auto Play';
    intervalId = setInterval(() => {
      const playerMove = pickComputerMove();
      playGame(playerMove);
    }, 300);
    isAutoPlaying = true;
  } else{
    autoplayText.innerHTML = 'Auto Play';
    clearInterval(intervalId);
    isAutoPlaying = false;
  }
}

document.querySelector('.js-rock-button')
  .addEventListener('click', () => {
    playGame('rock');
  });

document.querySelector('.js-paper-button')
.addEventListener('click', () => {
  playGame('paper');
});

document.querySelector('.js-scissors-button')
.addEventListener('click', () => {
  playGame('scissors');
});

document.body.addEventListener('keydown', (event) => {
  if (event.key === 'r') {
    playGame('rock');
  } else if (event.key === 'p') {
    playGame('paper');
  } else if (event.key === 's') {
    playGame('scissors');
  } else if (event.key === 'a') {
    autoPlay();
  } else if (event.key === 'Backspace') {
    resetScore();
  }
});

document.querySelector('.auto-play-button')
  .addEventListener('click', () => {
    autoPlay();
  })

function playGame(playerMove) {
  const computerMove = pickComputerMove();

  let result = '';

  if (playerMove === 'scissors') {
    if (computerMove === 'rock') {
      result = 'You lose.';
    } else if (computerMove === 'paper') {
      result = 'You win.';
    } else if (computerMove === 'scissors') {
      result = 'Tie.';
    }

  } else if (playerMove === 'paper') {
    if (computerMove === 'rock') {
      result = 'You win.';
    } else if (computerMove === 'paper') {
      result = 'Tie.';
    } else if (computerMove === 'scissors') {
      result = 'You lose.';
    }
    
  } else if (playerMove === 'rock') {
    if (computerMove === 'rock') {
      result = 'Tie.';
    } else if (computerMove === 'paper') {
      result = 'You lose.';
    } else if (computerMove === 'scissors') {
      result = 'You win.';
    }
  }

  if (result === 'You win.') {
    score.wins ++;
  } else if (result === 'You lose.') {
    score.losses ++;
  } else if (result === 'Tie.') {
    score.ties ++;
  }

  localStorage.setItem('score', JSON.stringify(score));

  updateScoreElement();

  document.querySelector('.js-result').innerHTML = result;

  document.querySelector('.js-moves').innerHTML = `You <img src="emoji-pic/${playerMove}-emoji.png" class="move-icon">  <img src="emoji-pic/${computerMove}-emoji.png" class="move-icon"> Computer`;
  }

  function updateScoreElement() {
  document.querySelector('.js-score')
  .innerHTML = `Wins: ${score.wins}, Losses: ${score.losses}, Ties: ${score.ties}`;
}

function pickComputerMove() {
  const randomNumber = Math.random();

  let computerMove = '';

  if (randomNumber >= 0 && randomNumber < 1 / 3) {
    computerMove = 'rock';
  } else if (randomNumber >= 1 / 3 && randomNumber < 2 / 3) {
    computerMove = 'paper';
  } else if (randomNumber >= 2 / 3 && randomNumber < 1) {
    computerMove = 'scissors';
  }

  return computerMove;
}
