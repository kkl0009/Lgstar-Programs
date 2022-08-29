/*
 * Name: Kollin Labowski
 * Date: December 15, 2020
 * Academic Integrity Statement: This program complies with the academic integrity
 * policies of WVU and CS 310
 * */
/* This function is used to find the log (base 2) of a given number */
lg(A, B) :- B is floor(log10(A)/log10(2)).

/* This expression is what is intended to be called by the user, it simple checks the
 * second input to determine whether it is a variable, and allows the variable to
 * have an assignment so as to not be undefined*/
lgstar(N, Iterations) :-
    var(Iterations) ->   
    (   
    	lgstareq(N, Safe),
    	Iterations = Safe
    );
    lgstareq(N,Iterations).

/* This expression is used to actually calculate the log star as was defined in the 
 * Unit 5 documentation*/
lgstareq(N, Iterations) :- 
    N > 1 -> 
    (   
    	lg(N, D), 
    	lgstareq(D, C),
    	Iterations is C + 1
    );
    Iterations = 0.