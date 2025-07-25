import React from 'react';

function ListofPlayers() {
  const players = [
    { name: 'Virat Kohli', score: 85 },
    { name: 'Rohit Sharma', score: 95 },
    { name: 'Jasprit Bumrah', score: 60 },
    { name: 'KL Rahul', score: 45 },
    { name: 'Hardik Pandya', score: 70 },
    { name: 'Ravindra Jadeja', score: 78 },
    { name: 'Shubman Gill', score: 50 },
    { name: 'Mohammed Siraj', score: 90 },
    { name: 'Rishabh Pant', score: 40 },
    { name: 'Axar Patel', score: 82 },
    { name: 'Ishan Kishan', score: 30 },
  ];

  const filteredPlayers = players.filter(player => player.score >= 70);

  return (
    <div>
      <h2>Players with score = 70</h2>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
