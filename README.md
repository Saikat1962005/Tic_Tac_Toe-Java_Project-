# Tic_Tac_Toe-Java_Project-
 Tic Tac Toe Game

This is a simple Tic Tac Toe game implemented in Java using Swing for the GUI. The game allows a human player to play against the computer.

 Key Concepts

 Object-Oriented Programming (OOP) Concepts

- Encapsulation: 
  - The `TicTacToe` class encapsulates the game's state and behavior. Private data members like `frame`, `buttons`, `currentPlayer`, and `random` ensure they cannot be accessed directly from outside the class.

- Abstraction:
  - Methods like `initializeButtons()`, `makeComputerMove()`, `getNextPlayer()`, `hasWon()`, and `isBoardFull()` abstract complex implementation details.

- Inheritance:
  - The `ButtonListener` class extends the `ActionListener` interface to define custom behavior for button clicks.
- Polymorphism:
  - The `ActionListener` interface allows for polymorphism. The `actionPerformed` method is overridden in the `ButtonListener` class to define specific behavior when a button is clicked.

 Loops

- For Loops:
  - Used in the `initializeButtons()` method to initialize the 3x3 grid of buttons.
  - Used in the `hasWon()` method to check if a player has won by iterating over rows and columns.

 Conditions

- If-Else Statements:
  - Used in the `actionPerformed()` method to check the state of the clicked button and determine the game's outcome.
  - Used in the `makeComputerMove()` method to determine the computer's next move and check for a win or a draw.
  - Used in the `hasWon()` method to check the winning conditions for rows, columns, and diagonals.
  - Used in the `isBoardFull()` method to check if the board is full.

 Packages and Methods

 `javax.swing` Package

- `JFrame`
  - `setDefaultCloseOperation(int operation)`: Sets the operation that will happen by default when the user initiates a "close" on this frame.
  - `setLayout(LayoutManager manager)`: Sets the layout manager for this container.
  - `add(Component comp)`: Adds the specified component to the end of this container.
  - `setSize(int width, int height)`: Sets the size of the frame.
  - `setVisible(boolean b)`: Shows or hides the frame depending on the value of parameter `b`.
  - `dispose()`: Releases all of the native screen resources used by this window.


- `JButton`
  - `setText(String text)`: Sets the button's text.
  - `setFont(Font font)`: Sets the button's font.
  - `addActionListener(ActionListener l)`: Adds the specified action listener to receive action events from this button.
  - `getText()`: Returns the button's text.

- `JOptionPane`
  - `showMessageDialog(Component parentComponent, Object message)`: Shows a message dialog with the specified message.

 `java.awt` Package

- `GridLayout`
  - Constructor `GridLayout(int rows, int cols)`: Creates a grid layout with the specified number of rows and columns.

- `Font`
  - Constructor `Font(String name, int style, int size)`: Creates a new font with the specified name, style, and size.

 
`java.awt.event` Package

- `ActionEvent`
  - `getSource()`: Returns the object on which the event initially occurred.

- `ActionListener`
  - `actionPerformed(ActionEvent e)`: Invoked when an action occurs.

 `java.util` Package

- `Random`
  - `nextInt(int bound)`: Returns a random integer between 0 (inclusive) and the specified value (exclusive).

 How to Run

1. Ensure you have Java installed on your machine.
2. Compile the program using the following command:
3. Run the program using the following command:


 Game Rules

- The game is played on a 3x3 grid.
- You are 'X', and the computer is 'O'. Players take turns putting their marks in empty squares.
- The first player to get 3 of their marks in a row (up, down, across, or diagonally) wins.
- If all 9 squares are full and no player has 3 marks in a row, the game is a draw.
