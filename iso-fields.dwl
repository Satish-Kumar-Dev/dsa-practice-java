%dw 2.0
output application/java

// ----------------------------------------------------
// Utility: Safe Right Padding (fixed width)
// ----------------------------------------------------
fun rpad(value, length) =
    do {
        var v = (value default "") as String
        var padded = v ++ (" " * length)
    }
    ---
    padded[0 to length - 1]

// ----------------------------------------------------
// FIELD 102  (Used for Internal + NEFT)
// Structure:
// "026        "  (11 chars)
// + solId
// + "   "        (3 spaces)
// + accountNo
// + "    "       (4 spaces)
// ----------------------------------------------------
fun buildField102(accountNo, solId) =
    do {
        var prefix = "026        "    // 026 + 8 spaces
        var separator = "   "
        var suffix = "    "
    }
    ---
    prefix ++
    (solId default "") ++
    separator ++
    (accountNo default "") ++
    suffix


// ----------------------------------------------------
// FIELD 103  (Normal / Internal)
// Structure:
// "  026        "  (2 spaces + 026 + 8 spaces)
// + solId
// + "   "
// + accountNo
// + "    "
// ----------------------------------------------------
fun buildField103(accountNo, solId) =
    do {
        var prefix = "  026        "
        var separator = "   "
        var suffix = "    "
    }
    ---
    prefix ++
    (solId default "") ++
    separator ++
    (accountNo default "") ++
    suffix


// ----------------------------------------------------
// FIELD 103_NEFT  (External NEFT / RTGS)
// Structure:
// "  " + bankId padded to 11
// + branchId padded to 8
// + accountNo padded to 19
// Total length max 40 chars
// ----------------------------------------------------
fun buildField103_neft(accountNo, bankId, branchId) =
    do {
        var prefix = "  " ++ rpad(bankId, 11)
        var branchBlock = rpad(branchId, 8)
        var accountBlock = rpad(accountNo, 19)
        var combined = prefix ++ branchBlock ++ accountBlock
    }
    ---
    combined[0 to 39]
