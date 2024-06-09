Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
Example 2:

Input: nums = [5], k = 9
Output: 0
 

Constraints:

1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
2 <= k <= 104

SOL
Algorithm
1. Initialization:
Ek array modulusCount initialize karo jo remainders ka frequency store karega.
modulusCount ko 0 se initialize karo using memset.
currentMod ko 0 se initialize karo jo current prefix sum remainder ko store karega.
subarrayCount ko 0 se initialize karo jo subarrays divisible by k ka count karega.
modulusCount[0] = 1 set karo kyunki ek tarika hai remainder 0 ka (empty subarray).
2. Iterate through the Array:
Array nums ko iterate karo:
Update Current Remainder:
currentMod ko update karo by adding current number nums[i] aur modulo k leke.
currentMod = ((currentMod + nums[i] % k) + k) % k.
Adding k before modulo k ensures negative numbers ko sahi handle karte hain. Is se humko kabhi negative index nahi milegi.
Update Subarray Count:
subarrayCount ko increment karo jitni baar ye remainder pehle aaya hai modulusCount[currentMod] se.
Increment Remainder Frequency:
modulusCount[currentMod] ko increment karo.
3. Return Result:
subarrayCount ko return karo jo final count hai subarrays divisible by k.

🎯Approach : PrefixSum - HashTable
Intuition 🔮
📜Pehle kuch mehtvapoorn baatein
1️⃣ Agar hum kisi array mai sum karte huye sum ka kisi number(divisor) remainder lete rahein, aur koi remainder repeat hojaye, toh iska matlab ye hain ki ek subaaray aisa milgya hai jiska sum divisor se divisible hai.
📥[1,1,1,1,1,1] , k = 3, modulusCount[1,0,0], 3 se 3 hi remainder aasakte hain : 0,1,2.
Hume 0 remainder toh empty array mai bhi milega isliye hum pehle se hi isko 1 set kardenge. Empty subarray count nahi hoga kyuki humko keval non empty chahiye. Iske alawa hum har baar remainder aane par usko increment karte rahenge.
pehli teen interation dekhein📤
sum = 0, remainder = 0, modulusCount[1,0,0]
sum = 1, remainder = 1, modulusCount[1,1,0]
sum = 2, remainder = 2, modulusCount[1,1,1]
sum = 3, remainder = 0, modulusCount[2,1,1]
Iss se ye sthapith hota hai ki remainder ka wapas aana ek full circle hai ⭕, aur ye ek aisa subarray deta hai jo humare divisor se divisible ho. Magar iska matlab ye nahi ki tum kisi ko wapas aane do apni zindagi mai... :)
2️⃣ Dusri baat jo humko dhyaan rakhni hai ki humko negative number bhi milenge array mai, jo ki humhaare ko remainder ko negative kar denge, but humko chahiye ki humara remainder har waqt >= 0 hona chahiye. Isliye hum remainder ko har waqt positive bnayenge.
Remainder or modulus positive number ke case mai toh ek hi hote hain, par negative number ke case mai hisab thoda badal jaata hai.
-5 divided 3 gives -2 as remainder, but -5 Mod 3 = 1
Modulus : Sabse chota vo number jo yadi hum diye huye number se subtract kardein, toh vo number humare divisor se poorn roop divide hojata hai .
Isliye ab ab modulus shabd ka prayog karenge.
Iske liye hum pehle karenge (sum + nums[i] % k), isko bol dete hain firstMod, isse humein ek number milega jiski absolute value < divisor hogi
Iske baad (firstMod + k) % k, k humara divisor hai
k plus karne se negative number modulas positive ho jayenge. Aur iska fir se modulas lenge taaki humein sahi modulas mil jaye, kyuki (x % y) == ((x + y) % y) ek property hai modulus ki.
Ab bas inn sab baaton ko jod dete hain aur sawal ko uski manjil tak pahucha dete hain. 🛤
1️⃣ Humne ye samaj liya hai ki prefix sum ka istemaal modulas calculation mai hoga, aur upar btaye huye tareeke se modulas sum calculate karte rahenge
2️⃣ Ab Hash table ka istemaal hoga iss modulas ko track karne ke liye. Hum ek frequency table bana lenge K (Divisor) size ki, kyuki K se divide hone par k tarah ke modulas hi possible hain. Oth position ko hum pehle se hi 1 ki frequency dedenge, kyuki sum = 0, toh k se divide hoga hi.
3️⃣ Ab jab bhi kabhi koi modulas repeat hoga, hum check karenge ki table mai ye kitni baar aaya, aur uss value ko result mai add kardenge. Iska baad iss modulas ki position pe + 1 kardenge. Aur iss jabke jod ko final result ke naam se return kar denge.