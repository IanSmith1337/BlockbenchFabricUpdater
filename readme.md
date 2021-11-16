# Blockbench Fabric Updater for 1.17

I grew tired of having to manually recode 1.15+ Fabric Java output files from Blockbench. So I made a script that generates a new file based on the output from BlockBench.

# How to use:

Download the jar from the releases page on the right. Then, in a terminal window, execute:

1. `cd </file/output/directory/>`
2. `java -jar <path/to/jarfile.jar> <path/to/java/file/model.java> <entityModelFileName>.java`

Make sure you replace `<entityModelFileName>` with your own entity name. After this, you should see your shiny new entity model file.

If you want to try the program out without a model file, download one of the test files included in the repo, and follow the instructions above.