import React from 'react';

function GuestPage() {
  return (
    <div>
      <h2>Welcome, Guest!</h2>
      <p>Here are available flights:</p>
      <ul>
        <li>🛫 Chennai ➡ Delhi - 10:00 AM</li>
        <li>🛫 Bangalore ➡ Mumbai - 2:30 PM</li>
        <li>🛫 Kolkata ➡ Hyderabad - 6:15 PM</li>
      </ul>
      <p><strong>Login to book tickets.</strong></p>
    </div>
  );
}

export default GuestPage;
