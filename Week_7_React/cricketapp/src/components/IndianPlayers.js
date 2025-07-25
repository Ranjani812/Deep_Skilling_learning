import React from 'react';

function IndianPlayers() {
  const oddTeam = ['Rohit', 'Kohli', 'Jadeja', 'Pant', 'Gill'];
  const evenTeam = ['Bumrah', 'Siraj', 'Rahul', 'Axar', 'Hardik'];

  const [captain1, vice1, ...othersOdd] = oddTeam;
  const [captain2, vice2, ...othersEven] = evenTeam;

  const T20Players = ['Surya', 'Chahal', 'Dube'];
  const RanjiTrophyPlayers = ['Pujara', 'Rahane'];

  const allPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Destructured Odd Team</h2>
      <p>Captain: {captain1}, Vice-Captain: {vice1}</p>
      <p>Others: {othersOdd.join(', ')}</p>

      <h2>Destructured Even Team</h2>
      <p>Captain: {captain2}, Vice-Captain: {vice2}</p>
      <p>Others: {othersEven.join(', ')}</p>

      <h2>Merged Players List</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
