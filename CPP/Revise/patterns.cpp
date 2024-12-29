#include <iostream>
using namespace std;
int i, j;
void printpattern1(int size)
{
    // outer loop = no of lines
    for (int i = 0; i < size; i++)
    {
        // inner loop = no of columns
        for (int j = 0; j < size; j++)
        {
            cout << "*";
        }
        cout << endl;
    }
}
void printpattern2(int size)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << "*";
        }
        cout << endl;
    }
}
void printpattern3(int size)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << j;
        }
        cout << endl;
    }
}
void printpattern4(int size)
{
    for (int i = 1; i <= size; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            cout << i;
        }
        cout << endl;
    }
}
void printpattern5(int size)
{
    for (int i = 0; i < size; i++)
    {
        // here j starts from size and decrements upon iterations
        for (int j = size - i; j > 0; j--)
        {
            cout << "*";
        }
        cout << endl;
    }
}
void printpattern6(int size) // similar to pattern5
{
    for (int i = 0; i < size; i++)
    {
        // here j starts from and increments upon iterations
        for (int j = 1; j <= size - i; j++)
        {
            cout << j;
        }
        cout << endl;
    }
}
void printpattern7(int size)
{
    for (i = 0; i < size; i++)
    {
        // space
        for (j = 0; j < size - i - 1; j++)
        {
            cout << "-";
        }
        // star
        for (j = 0; j < 2 * i + 1; j++)
        {
            cout << "*";
        }
        // space
        for (j = 0; j < size - i - 1; j++)
        {
            cout << "-";
        }
        cout << endl;
    }
}
void printpattern8(int size)
{
    for (int i = 0; i < size; i++)
    {
        for (j = 0; j < i; j++)
        {
            cout << "-";
        }
        for (j = 0; j < 2 * size - 2 * i - 1; j++)
        {
            cout << "*";
        }
        for (j = 0; j < i; j++)
        {
            cout << "-";
        }
        cout << endl;
    }
}
void printpattern9(int size) // pattern 7 and pattern 8
{ 
    for (i = 0; i < size; i++)
    {
        // space
        for (j = 0; j < size - i - 1; j++)
        {
            cout << "-";
        }
        // star
        for (j = 0; j < 2 * i + 1; j++)
        {
            cout << "*";
        }
        // space
        for (j = 0; j < size - i - 1; j++)
        {
            cout << "-";
        }
        cout << endl;
    }
    for (int i = 0; i < size; i++)
    {
        for (j = 0; j < i; j++)
        {
            cout << "-";
        }
        for (j = 0; j < 2 * size - 2 * i - 1; j++)
        {
            cout << "*";
        }
        for (j = 0; j < i; j++)
        {
            cout << "-";
        }
        cout << endl;
    }
}
int main()
{
    int size = 5;
    printpattern9(size);
    cout << endl;
    return 0;
}
