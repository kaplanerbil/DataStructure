'''
Created on Apr 13, 2018

@author: erbil
'''

def bubble(l_elems):
    is_swapped = False 
    for i in range(len(l_elems) - 1):
        # compares each pair of adjacent items and swaps them if they are in the wrong order
        if l_elems[i] > l_elems[i + 1]:
            is_swapped = True
            l_elems[i], l_elems[i + 1] = l_elems[i + 1], l_elems[i]
    # if is_swapped is True, the algorithm needs to pass through the list again
    if is_swapped:
        return bubble(l_elems)
    else:
        return l_elems

print(bubble([4,3,-1,67,11,33,44,9]))
print(bubble([5,6,5,3,3]))