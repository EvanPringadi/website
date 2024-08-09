const lyricsElement = document.getElementById('lyrics');
const lyrics = `I don't care, go on and tear me apart
I don't care if you do, ooh-ooh, ooh
'Cause in a sky, 'cause in a sky full of stars
I think I saw you`;

let typedText = '';

const typeWriter = () => {
  if (typedText.length < lyrics.length) {
    typedText += lyrics[typedText.length];
    lyricsElement.textContent = typedText;
    setTimeout(typeWriter, 70); // Adjust speed here (lower value = faster typing)
  } else {
    // Restart animation when all lyrics are typed
    typedText = '';
    setTimeout(typeWriter, 100); // Adjust delay before restart (1 second here)
  }
};

typeWriter();
