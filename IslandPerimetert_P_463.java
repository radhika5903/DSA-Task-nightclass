class IslandPerimetert_P_463{
    public int help(int[][] grid, boolean[][] visited, int i, int j) {
    // Check if out of bounds
    if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return 0;
    // If it's water (0) or already visited, return 0
    if (grid[i][j] == 0 || visited[i][j]) return 0;
    
    // Mark the cell as visited
    visited[i][j] = true;
    
    int perimeter = 4;

    // Check the four adjacent cells (up, right, down, left)
    if (i > 0 && grid[i - 1][j] == 1) perimeter--; // Up
    if (j + 1 < grid[0].length && grid[i][j + 1] == 1) perimeter--; // Right
    if (j > 0 && grid[i][j - 1] == 1) perimeter--; // Left
    if (i + 1 < grid.length && grid[i + 1][j] == 1) perimeter--; // Down

    // Explore all four directions recursively
    perimeter += help(grid, visited, i + 1, j); // Down
    perimeter += help(grid, visited, i, j + 1); // Right
    perimeter += help(grid, visited, i - 1, j); // Up
    perimeter += help(grid, visited, i, j - 1); // Left

    return perimeter;
}

public int islandPerimeter(int[][] grid) {
    // Create a visited array to track cells we've already explored
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    int ans = 0;

    // Loop through all cells in the grid
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            // If we find land (1) that hasn't been visited, calculate its perimeter
            if (grid[i][j] == 1 && !visited[i][j]) {
                ans = Math.max(ans, help(grid, visited, i, j));
            }
        }
    }

    return ans;
}
}