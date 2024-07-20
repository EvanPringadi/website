const lyricsElement = document.getElementById('lyrics');
const lyrics = 'Twinkle twinkle little star,\nHow I wonder what you are!\nUp above the world so high,\nLike a diamond in the sky.\nWhen the blazing sun is gone,\nWhen he nothing shines upon,\nThen you show your little light,\nTwinkle twinkle all the night.';

let typedText = '';

const typeWriter = () => {
  if (typedText.length < lyrics.length) {
    typedText += lyrics[typedText.length];
    lyricsElement.textContent = typedText;
    setTimeout(typeWriter, 10); // Adjust speed here (lower value = faster typing)
  } else {
    // Restart animation when all lyrics are typed
    typedText = '';
    setTimeout(typeWriter, 100); // Adjust delay before restart (1 second here)
  }
};

typeWriter();
