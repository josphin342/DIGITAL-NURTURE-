// Events Data
const events = [
    { id: 1, name: "Music Festival", date: "2023-06-15", category: "Music", seats: 100 },
    { id: 2, name: "Art Workshop", date: "2023-07-20", category: "Art", seats: 50 },
    { id: 3, name: "Tech Conference", date: "2023-08-10", category: "Technology", seats: 200 },
];

// DOM Elements
const eventContainer = document.getElementById("event-container");
const categoryFilter = document.getElementById("category-filter");
const searchBar = document.getElementById("search-bar");
const loadingSpinner = document.getElementById("loading-spinner");

// Render Events Function
function renderEvents(filteredEvents) {
    eventContainer.innerHTML = ""; // Clear existing events
    filteredEvents.forEach(event => {
        const card = document.createElement("div");
        card.className = "event-card";
        card.innerHTML = `
            <h2>${event.name}</h2>
            <p>Date: ${event.date}</p>
            <p>Category: ${event.category}</p>
            <p>Seats Available: ${event.seats}</p>
            <button onclick="register('${event.id}')">Register</button>
        `;
        eventContainer.appendChild(card);
    });
}

// Register Function
function register(eventId) {
    const event = events.find(e => e.id === parseInt(eventId));
    if (event && event.seats > 0) {
        event.seats--;
        alert(`You have registered for ${event.name}! Remaining seats: ${event.seats}`);
        renderEvents(events); // Re-render events to update seats
    } else {
        alert(`Registration failed for ${event.name}. No seats available.`);
    }
}

// Fetch Mock API Data
async function fetchEvents() {
    try {
        loadingSpinner.style.display = "block";
        const response = await fetch("https://mockapi.example.com/events");
        const data = await response.json();
        loadingSpinner.style.display = "none";
        renderEvents(data);
    } catch (error) {
        console.error("Error fetching events:", error);
        loadingSpinner.style.display = "none";
    }
}

// Filter by Category
categoryFilter.addEventListener("change", () => {
    const category = categoryFilter.value;
    const filtered = category === "All"
        ? events
        : events.filter(event => event.category === category);
    renderEvents(filtered);
});

// Search by Name
searchBar.addEventListener("input", () => {
    const query = searchBar.value.toLowerCase();
    const filtered = events.filter(event => event.name.toLowerCase().includes(query));
    renderEvents(filtered);
});

// Initial Render
renderEvents(events);

// Form Validation (Task 11)
document.querySelector("form")?.addEventListener("submit", (event) => {
    event.preventDefault();
    const name = event.target.name.value.trim();
    const email = event.target.email.value.trim();
    if (!name || !email) {
        alert("Name and email are required!");
        return;
    }
    alert(`Registered as ${name} with email ${email}`);
});

