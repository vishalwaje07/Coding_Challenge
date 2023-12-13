// YourDataService.js
import axios from 'axios';

const BASE_URL = 'http://localhost:8080/api/data';

export const fetchData = async (year, topics, region, city) => {
  try {
    const response = await axios.get(`${BASE_URL}/filter`, {
      params: { year, topics, region, city },
    });
    return response.data;
  } catch (error) {
    console.error('Error fetching data:', error);
    throw error;
  }
};
