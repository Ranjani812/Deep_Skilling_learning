import React from 'react';

const SayWelcome = () => {
  const greet = (message) => {
    alert(message);
  };

  return (
    <div>
      <button onClick={() => greet("Converting to euro amount is 6400")}>Say Welcome</button>
    </div>
  );
};

export default SayWelcome;
