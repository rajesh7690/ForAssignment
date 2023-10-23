function reverseWord(){
    var revstr="";
    var arr=str.split(" ");
    for (let i = 0; i < arr.length; i++) {
        for (let j = arr[i].length-1; j >=0 ; j--) {
            revstr+=arr[i][j]
        }
        revstr+=" "
    }
    return revstr.trimEnd()
}
var str = "The quick brown fox";
console.log(reverseWord(str))