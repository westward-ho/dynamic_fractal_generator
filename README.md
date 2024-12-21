# Dynamic Fractal Generator 🌀

## Overview
The **Dynamic Fractal Generator** is an interactive application designed to generate and visualize fractals such as the **Mandelbrot set** and **Julia set**. The project focuses on exploring the beauty of mathematics through fractals while offering users an engaging way to interact with and customize their fractal visualizations.

Key features include:
- Real-time fractal rendering with zoom and pan functionality.
- Adjustable parameters for fractal generation, such as iteration depth and complex number inputs.
- Smooth animations to explore intricate fractal details.

---

## Features
- **Fractal Generation**:
  - Visualize the **Mandelbrot set** and **Julia set** in stunning detail.
- **Interactive Controls**:
  - Zoom and pan using mouse interactions.
  - Sliders for modifying real and imaginary parts of the Julia set's constant.
  - Adjust iteration depth to control fractal detail levels.
- **Customization**:
  - Switch between fractals dynamically.
  - Modify color gradients for a personalized visualization.
- **Optional**:
  - Save fractal images to your system for further exploration.

---

## Tech Stack
- **Programming Language**: Java
- **Libraries/Frameworks**:
  - JavaFX for GUI and interactive visualization.
  - Custom-built utilities for complex number calculations.
- **Tools**:
  - GitHub for version control.

--- 

## How It Works
1. **Complex Plane Mapping**:
   - Each pixel is mapped to a point in the complex plane.
   - For the Mandelbrot set, we compute \( z = z^2 + c \) iteratively and determine whether \( z \) “escapes” a boundary.

2. **Color Mapping**:
   - The number of iterations before escape determines the color of each pixel.
   - Smooth gradients are applied for aesthetic appeal.

3. **Real-Time Interaction**:
   - Zoom and pan modify the visible portion of the complex plane.
   - Adjusting Julia set parameters updates the visualization in real-time.

---

## Future Enhancements
- Add animations for real-time zooming and parameter sweeps.
- Implement additional fractals (e.g., Burning Ship or Newton Fractals).
- Enable users to save their fractals as image files.

---

## Contributors
- **Triss Lazaj** 
