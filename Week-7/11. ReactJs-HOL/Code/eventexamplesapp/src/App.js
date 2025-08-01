import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';
import './App.css';

function App() {
  const [counter, setCounter] = useState(0);

  // Increment with multiple actions
  const handleIncrement = () => {
    increment();
    sayHello();
  };

  const increment = () => {
    setCounter(counter + 1);
  };

  const decrement = () => {
    setCounter(counter - 1);
  };

  const sayHello = () => {
    alert('Hello! Counter incremented.');
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleSyntheticEvent = (event) => {
    alert('I was clicked');
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>React Event Examples</h1>

      <h2>Counter: {counter}</h2>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={decrement}>Decrement</button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome to the React Event Lab!")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={handleSyntheticEvent}>
        Synthetic Event (OnPress)
      </button>

      <br /><br />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
