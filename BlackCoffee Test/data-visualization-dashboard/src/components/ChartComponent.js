// YourChartComponent.js
import React from 'react';
import { Bar } from 'react-chartjs-2';

const YourChartComponent = ({ data }) => {
  // Adjust data processing based on your chart library and requirements
  const chartData = {
    labels: data.map(item => item.country), // Example: Use country as labels
    datasets: [
      {
        label: 'Intensity',
        data: data.map(item => item.intensity),
        backgroundColor: 'rgba(75,192,192,0.2)',
        borderColor: 'rgba(75,192,192,1)',
        borderWidth: 1,
      },
    ],
  };

  const chartOptions = {
    scales: {
      y: {
        beginAtZero: true,
      },
    },
  };

  return (
    <div>
      <h2>Intensity Chart</h2>
      <Bar data={chartData} options={chartOptions} />
    </div>
  );
};

export default YourChartComponent;
