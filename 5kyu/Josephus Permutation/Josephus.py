def josephus(items,k):
    res = []
    i, j, listLen = 0, k, len(items)
    while (listLen):
        j -= 1
        i = 0 if i >= listLen else i
        if (not j) :
            res.append(items.pop(i))
            listLen -= 1
            j = k
        else :
            i += 1

    return res