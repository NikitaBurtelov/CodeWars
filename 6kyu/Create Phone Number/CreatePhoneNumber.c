char *create_phone_number(char phnum[15], const unsigned char nums[10])
{
    for(int i = 0, j = 0; i < 15; i++)
    {
        switch (i)
        {
          case 0:
            phnum[i] = '(';
            break;
          case 4:
            phnum[i] = ')';
            break;
          case 5:
            phnum[i] = ' ';
            break;
          case 9:
            phnum[i] = '-';
            break;
          case 14:
            phnum[i] = 0;
            break;
          default:
            phnum[i] = '0' + nums[j];
            j++;
        }
    }
    return phnum;
}