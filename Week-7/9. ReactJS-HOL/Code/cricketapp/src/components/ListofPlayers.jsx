// src/components/ListofPlayers.jsx
import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 80 },
    { name: "Rohit", score: 95 },
    { name: "Rahul", score: 65 },
    { name: "Pant", score: 60 },
    { name: "Bumrah", score: 85 },
    { name: "Shami", score: 45 },
    { name: "Iyer", score: 77 },
    { name: "Gill", score: 70 },
    { name: "Ashwin", score: 50 },
    { name: "Jadeja", score: 90 },
    { name: "Surya", score: 40 }
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with Score below 70</h2>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
