

# BNF

    <line>        ----> <expression>;
    
    <expression>  ----> ADD <element> |
                        REMOVE        |
                        PEEK          |
                        LENGTH        |
                        EMPTY         |
                        NOT_EMPTY     |
                        VIEW          |
                        IF (<if_expr>)
    
    <if_expr>     ----> EMPTY         |
                        NOT_EMPTY
    
    <element>     ----> <int>
    
    <int>         ----> 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |

