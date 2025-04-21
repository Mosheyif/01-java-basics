# Distributed Log Analyzer

Names: Moshe Ifrach, Chaim shachar
Emails: mosheyif@edu.jmc.ac.il, chaimsha@edu.jmc.ac.il

## Design Patterns Used

1. Factory Pattern (LogAnalyzerFactory)
   - Used to create different analyzer instances
   - Solves the problem of creating objects without exposing instantiation logic
   - Can be extended by adding new analyzer implementations and registering them

2. Strategy Pattern (LogAnalyzer interface)
   - Used to define a family of algorithms (different analysis methods)
   - Solves the problem of switching between different analysis strategies
   - Can be extended by creating new classes implementing the LogAnalyzer interface

3. Singleton Pattern (ConfigurationManager)
   - Used to ensure a single instance of the configuration manager
   - Solves the problem of accessing shared configuration across the application
   - Can be extended by adding new configuration properties