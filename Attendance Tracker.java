/*
You are given a list where 1 means present and 0 means absent.

attendance = [1, 0, 1, 1, 0, 1, 1]


Task:

Count total present students

Count total absent students

*/

present = 0
absent = 0

for status in attendance:
    if status == 1:
        present += 1
    else:
        absent += 1

print("Present:", present)
print("Absent:", absent)
