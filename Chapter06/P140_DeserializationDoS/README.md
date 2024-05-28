# Avoiding DoS attacks at deserialization:

First, write a snippet of code that can be successfully serialized but, at the deserialization phase, causes a DoS
attack. Second, write a filter that avoids this unpleasant scenario.