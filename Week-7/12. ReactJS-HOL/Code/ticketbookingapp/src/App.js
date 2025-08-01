import React, { useState } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  let pageContent;
  if (isLoggedIn) {
    pageContent = <UserPage />;
  } else {
    pageContent = <GuestPage />;
  }

  return (
    <div className="App">
      <h1>✈️ Flight Booking Portal</h1>
      {isLoggedIn ? (
        <button onClick={handleLogout} className="btn logout">Logout</button>
      ) : (
        <button onClick={handleLogin} className="btn login">Login</button>
      )}
      {pageContent}
    </div>
  );
}

export default App;
