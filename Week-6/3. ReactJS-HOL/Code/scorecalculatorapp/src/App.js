import logo from './logo.svg';
import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <h1>Score Calculator</h1>
      <CalculateScore
        Name="John Doe"
        School="ABC High School"
        total={296}
        goal={3}
      />
    </div>
  );
}

export default App;
