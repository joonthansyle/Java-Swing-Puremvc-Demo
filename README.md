# Java-Swing-Puremvc-Demo
<!-- GETTING STARTED -->
## Getting Started
This is a sample project of how to implement Puremvc in Java.
To get a local copy just follow below simple steps.

### Prerequisites
1. Get a copy of Puremvc API in [https://github.com/joonthansyle/puremvc](https://github.com/joonthansyle/puremvc)
2. Get a copy of [https://github.com/joonthansyle/Java-Swing-Puremvc-Demo](https://github.com/joonthansyle/Java-Swing-Puremvc-Demo)
3. Extract the these to your desired directory separately

### Installation
1. Create a gradle java project 
2. Open the created project and edit "settings.gradle"
3. Add the 2 prequisites mentioned aboved in "settings.gradle"
   ```sh
   include(':puremvc')
   project(':puremvc').projectDir = new File("C:\\<replace with your directory>\\puremvc")
   include(':JavaSwingPuremvcDemo')
   project(':JavaSwingPuremvcDemo').projectDir = new File("C:\\<replace with your directory>\\JavaSwingpPuremvcDemo")
   ```
4. Insert the dependency to your main project - "build.gradle"
   ```sh
   dependencies {
    api project(':JavaSwingPuremvcDemo')
    ...
   }
   ```

6. Create java file in the main project and insert the following codes:
   ```sh
   public static void main(String[] args) {
        runModuleJavaSwingPuremvcDemo();
    }
    private static void runModuleJavaSwingPuremvcDemo() {
        new SwingPuremvcDemo();
    }
   ```
7. Run the main program

## Acknowledgments
PUREMVC: [https://github.com/PureMVC]https://github.com/PureMVC

Should you find any concerns, I will be glad to know!!
Thanks
