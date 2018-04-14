'''
Created on Apr 14, 2018

@author: erbil
'''

def find(l_elems, character, start_index, end_index):
    if start_index <= end_index:
        medium_index = int((start_index + end_index)/2)
        print(medium_index)
        if l_elems[medium_index]==character:
            return medium_index
        elif l_elems[medium_index]>character:
            return find(l_elems, character, start_index, medium_index-1)
        else:
            return find(l_elems, character, medium_index+1, end_index)
        
print("starting")
array=['a', 'b', 'c', 'd', 'f', 'g', 'o', 'p']
index=find(array, 'u', 0, len(array)-1)
print("index=" + str(index))