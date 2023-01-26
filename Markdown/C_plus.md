# c언어

* 동적 배열

    ```c
    int*n = (int*)malloc(sizeof(int) * N);
    ```

* 동적 문자열 2차원 배열

    ```c
    char **n = (char**)malloc(sizeof(char*) * N);
    ```

    ```c
    for(int i = 0; i < N; i++)
        n[i] = (char*)malloc(sizeof(char) * 50);
    ```

* 문자열 길이

    ```c
    #include <string.h> 
        strlen(문자열)
    ```
