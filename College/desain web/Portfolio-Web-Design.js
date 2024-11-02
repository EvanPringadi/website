const semuaTugas = [
  [
    {date: "25/09/2024", message: 'Pertemuan 1', src: ''},
    {date: "25/09/2024", message: '', src: 'minggu-1/1124012-Evan Ashley Pringadi/fruits.html'}, 
    {date: "25/09/2024", message: '', src: 'minggu-1/1124012-Evan Ashley Pringadi/welcome.html'},
    {date: "25/09/2024", message: '', src: 'minggu-1/1124012-Evan Ashley Pringadi/wiki-page.html'}
  ],
  [
    {date: "30/09/2024", message: 'Pertemuan 1', src: ''},
    {date: "30/09/2024", message: '', src: 'minggu-2/1124012_Evan Ashley Pringadi_Table_Lists.html'},
    {date: "02/10/2024", message: 'Pertemuan 2', src: ''},
    {date: "02/10/2024", message: '', src: 'minggu-2/1124012_Evan Ashley Pringadi_Sesi4/index.html'}
  ], [
    {date: "07/10/2024", message: 'Pertemuan 1', src: ''},
    {date: "07/10/2024", message: '', src: 'minggu-3/pertemuan 1/bird.html'},
    {date: "07/10/2024", message: '', src: 'minggu-3/pertemuan 1/iFrame.html'},
    {date: "09/10/2024", message: 'Pertemuan 2 ~ Kuis 1', src: ''},
    {date: "09/10/2024", message: '', src: 'minggu-3/pertemuan 2/index.html'}
  ]
]

document.querySelector("nav").addEventListener("click", (event) => {
  if(event.target.classList.contains("minggu")) {
    event.preventDefault();
    const minggu = event.target.getAttribute("minggu");
    renderTugas(semuaTugas[minggu-1], minggu);
}});

function renderTugas(tugas, minggu){
  let date = tugas[0].date;
  let html = 
  `
          <section>
            <img src="images/profile.jpg" class="profile">
            <div class="message-info">
              <div class="name">Vann</div>
              <div class="date">${date}</div>
              <div class="message">
                <p>Minggu ke-${minggu}</p>
              </div>
            </div>
          </section>
  `;
  for (let i = 1; i <= tugas.length; i++) {
    date = tugas[i-1].date;
    const message = tugas[i-1].message;
    if(message!=='') {
      html += `
          <section>
            <img src="images/profile.jpg" class="profile">
            <div class="message-info">
              <div class="name">Vann</div>
              <div class="date">${date}</div>
              <div class="message">
                <p>${message}</p>
              </div>
            </div>
          </section>
          `;
    } else {
      const src = tugas[i-1].src;
      html += `
          <section>
            <img src="images/profile.jpg" class="profile">
            <div class="message-info">
              <div class="name">Vann</div>
              <div class="date">${date}</div>
              <div class="message">
                <div class="iframe-container">
                  <iframe src="${src}"></iframe>
                </div>
              </div>
            </div>
          </section>
          `;
    }
  }
  document.querySelector("main").innerHTML = html;
}

