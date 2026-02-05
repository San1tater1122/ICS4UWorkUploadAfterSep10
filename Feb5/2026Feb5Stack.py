browser_stack = []

browser_stack.append("item1")
browser_stack.append("item2")
browser_stack.append("item3")
browser_stack.append("item4")

print("Current stack:", browser_stack)

browser_stack.pop()
print("After 1st back:", browser_stack)
browser_stack.pop()
print("After 2nd back:", browser_stack)

print("Current website:", browser_stack[-1])
