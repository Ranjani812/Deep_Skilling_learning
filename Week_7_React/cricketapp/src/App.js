import React from 'react';
import './App.css';
import ListofPlayers from './components/ListofPlayers';

import IndianPlayers from './components/IndianPlayers';

function App() {
  const flag = true; // Toggle between true and false to test

  return (
    <div className="App">
      <h1>🏏 Cricket Player Dashboard</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
