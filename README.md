# 311-Project

| Assigned              | Todo (0% Done)                | Doing (0% - 100% Done)   | Done (100% Done) |
|-----------------------|-------------------------------|--------------------------|------------------|
| Sam, Ganesh, Mohommed |                               | Create BNF (10% done)    |                  |
|                       | Create Denotational Semantics |                          |                  |
| Sam                   |                               | Create Parser (90% done) |                  |
|                       | Create Lexical Analyzer       |                          |                  |
|                       | Create Pseudo-compiler        |                          |                  |

# Todo specifics
## Create BNF
   Come up with syntax for our language and write BNF/EBNF to specify it. Language should support all queue functions, including:
- [ ] Add
- [ ] Remove
- [ ] Peek
- [ ] Get Length
- [ ] Is Empty
## Create Denotational Semantics
   Write a set of denotaional semantics detailing semantics of queue creation and function calls
## Create Parser
   Create a parser that will run through source code and return a list of all valid tokens found. Parser will:
- [X] Take in the source code of the program
- [ ] Extracts Tokens
- [X] Return an array of tokens for the program
## Create Lexical Analyzer 
   Create a lexical analyzer that:
- [ ] Takes its input from our parser
- [ ] Checks the syntax against our BNF
- [ ] Checks semantics against denotational semantic rules
- [ ] Evaluates action to be taken
- [ ] Passes instructions to compiler to preform actions
## Create Pseudo Compiler
   Runs commands as specified by the lexical analyzer. This includes:
- [ ] Maintain state of program while lexical analyzer is working
- [ ] Take instructions from analyzer to adjust state and the queue
- [ ] Preform instructions using Java
- [ ] Run program


