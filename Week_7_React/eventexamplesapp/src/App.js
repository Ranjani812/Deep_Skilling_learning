import React from 'react';
import Counter from './components/Counter';
import SayWelcome from './components/SayWelcome';
import OnPress from './components/OnPress';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  return (
    <div className="App">
      <h1>Event Examples App</h1>
      <Counter />
      <SayWelcome />
      <OnPress />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
