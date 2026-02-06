/*
You are managing the entry for a high-end gala.

You start with a list: guests = ["Alice", "Bob", "Charlie", "David"].

The Tasks:

"Eve" arrives late; add her to the end of the list.

"Bob" is actually a VIP; move him to the very front of the list.

"Charlie" cancels; remove him from the list using his name.

Print the final guest count and the sorted list alphabetically.

*/

guests = ["Alice", "Bob", "Charlie", "David"]

# 1. Eve arrives late
guests.append("Eve")

# 2. Move Bob to the front
guests.remove("Bob")
guests.insert(0, "Bob")

# 3. Charlie cancels
guests.remove("Charlie")

# 4. Final count and sorted list
print(f"Guest Count: {len(guests)}")
guests.sort()
print(f"Sorted Guests: {guests}")
