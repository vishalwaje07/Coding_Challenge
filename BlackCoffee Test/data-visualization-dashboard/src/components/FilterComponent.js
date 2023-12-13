// YourFilterComponent.js
import React, { useState } from 'react';

const YourFilterComponent = ({ setFilters }) => {
  const [year, setYear] = useState(0);
  const [topics, setTopics] = useState('');
  const [region, setRegion] = useState('');
  const [city, setCity] = useState('');

  const handleFilterChange = () => {
    setFilters({ year, topics, region, city });
  };

  return (
    <div>
      <label>Year:</label>
      <input type="number" value={year} onChange={(e) => setYear(e.target.value)} />

      <label>Topics:</label>
      <input type="text" value={topics} onChange={(e) => setTopics(e.target.value)} />

      <label>Region:</label>
      <input type="text" value={region} onChange={(e) => setRegion(e.target.value)} />

      <label>City:</label>
      <input type="text" value={city} onChange={(e) => setCity(e.target.value)} />

      <button onClick={handleFilterChange}>Apply Filters</button>
    </div>
  );
};

export default YourFilterComponent;
