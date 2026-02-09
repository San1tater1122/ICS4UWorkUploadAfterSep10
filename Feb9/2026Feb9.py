locker_stack = []

locker_stack.append("item1")
locker_stack.append("item2")
locker_stack.append("item3")

print("Locker stack:", locker_stack)
removed_item = locker_stack.pop()
print("Removed item:", removed_item)
print("Updated locker stack:", locker_stack)
print("Top item in the stack:", locker_stack[-1])
