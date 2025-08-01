import React from 'react';

function UserPage() {
  return (
    <div>
      <h2>Welcome Back, User!</h2>
      <p>Select your flight and proceed to book:</p>
      <ul>
        <li>🛫 Chennai ➡ Delhi - ₹5,000 <button>Book Now</button></li>
        <li>🛫 Bangalore ➡ Mumbai - ₹4,000 <button>Book Now</button></li>
        <li>🛫 Kolkata ➡ Hyderabad - ₹4,500 <button>Book Now</button></li>
      </ul>
    </div>
  );
}

export default UserPage;
