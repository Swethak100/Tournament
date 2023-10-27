const teamInfoArray = [];
const scheduledMatches = [];

document.getElementById('addTeamButton').addEventListener('click', function () {
   
    const teamName = document.getElementById('teamNameInput').value;
    const captainName = document.getElementById('captainNameInput').value;
    const teamCards = document.getElementById('teamCards');

    if (teamName && captainName && teamInfoArray.length < 6) {
       
        const newTeamCard = document.createElement('div');
        newTeamCard.classList.add('team-card');
        newTeamCard.innerHTML = `
            <h3>Team: ${teamName}</h3>
            <p>Captain: ${captainName}</p>
        `;
        teamCards.appendChild(newTeamCard);

        teamInfoArray.push({ teamName, captainName });
        teamNameInput.value = '';
        captainNameInput.value = '';

        if (teamInfoArray.length >= 2) {
            document.getElementById('matchDate').removeAttribute('disabled');
            document.getElementById('scheduleButton').removeAttribute('disabled');
        }
    }
    console.log(teamInfoArray);
});

function schedule() {
        const matchDate = new Date(document.getElementById('matchDate').value);
        if (matchDate) {
            scheduledMatches.length = 0; 
            for (let i = 0; i < teamInfoArray.length; i++) {
                const teamName = teamInfoArray[i].teamName;
                const scheduledDate = new Date(matchDate);
                scheduledDate.setDate(matchDate.getDate() + i);
                const formattedDate = formatDate(scheduledDate);
                scheduledMatches.push({ teamName, scheduledDate });

            }
         
            sessionStorage.setItem('scheduledMatches', JSON.stringify(scheduledMatches));
            window.location.href = 'match_info.html';
        } else {
            alert('Please select a valid date for scheduling.');
        }
}
console.log(scheduledMatches);
function formatDate(date) {
    const options = { year: 'numeric', month: '2-digit', day: '2-digit' };
    return date.toLocaleDateString(undefined, options);
}