# Find what kinds of words present.

# Given Paragraph 
- A pattern P is called a subsequence of Text T if the pattern preserves the relative ordering of characters within the text T and it might not appear in a continuous fashion. 
- In mathematics, a subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
- We need to be more detailed this time - these are the exact Gigya API calls that we’ll be making. Should be able to do that from the login tests we did before. We’ll want to make sure that the test plan doesn’t include anything else that hits Gigya.
- The way user experience and clues work will be re-used from previous code. Parts leading up to that will be redone for this release - Landing page for online test (more than an hour before start of test it shows “please come back” - if they come within the hour they can log in for the test. Can wait there until 10 minutes before test starts. Can then bring up test window.
- This thread is a good start to implement a simple KVM program. Some projects such as kvm-hello-world and kvmtool are worthy to take a look as well. And OSDev.org has great resources to learn system architecture knowledge
- KVM (Kernel-base Virtual Machine) is a virtual machine that implemented native in Linux kernel. As you know, VM usually used for creating a separated and independent environment. As the official site described, each virtual machine created by KVM has private virtualized hardware: a network card, disk, graphics adapter, etc
- To execute 64-bit assembled code, we need to set vCPU into long mode. And this wiki page describes how to switch from real mode to long mode, I highly recommend you read it as well. The most complicated part of switching into long mode is to set up the page tables for mapping virtual address into physical address. x86-64 processor uses a memory management feature named PAE (Physical Address Extension), contains of four kinds of tables: PML4T, PDPT, PDT, and PT. The way these tables work is that each entry in the PML4T points to a PDPT, each entry in a PDPT to a PDT and each entry in a PDT to a PT. Each entry in a PT then points to the physical address

# Output : 
------ 

Word = ?

Verb = ? 

Aux Verb = ? 

The word "The" = ? 
