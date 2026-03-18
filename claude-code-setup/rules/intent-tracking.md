# Intent Drift Prevention

## Rule: Track and Verify Original Intent

When working on a task that spans more than 10 tool calls:

1. **At the start**: Mentally note the user's original request and goal
2. **Every ~20 tool calls**: Pause and verify: "Am I still working toward the original goal?"
3. **Before any major direction change**: Explicitly state what you're about to do differently and why
4. **If you notice drift**: Stop, summarize what you've done so far, and ask the user if you should continue in this direction

## Why This Matters

In long sessions (100+ turns), the agent tends to drift from the original intent.
The last measured session had a 12.1% correction rate (13 corrections in 107 turns).
Most corrections likely came from the agent going off-track in a long session.

## Signs of Intent Drift

- You're working on something the user didn't explicitly ask for
- You're "improving" code that wasn't part of the original request
- You've lost track of which step you're on in a multi-step task
- The user says "nein", "nicht das", "stop", "so nicht" — these are drift corrections

## Recovery

If you detect drift: Don't try to justify it. Simply say:
"Ich bin vom ursprünglichen Ziel abgewichen. Das Ziel war: [original intent]. Soll ich zurückkehren?"
