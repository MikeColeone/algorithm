function compareVersion(version1: string, version2: string): number {

    let temp1 = version1.split('.').map(str => removeZero(str));
    let temp2 = version2.split('.').map(str => removeZero(str));

    for (let i = 0; i < Math.max(temp1.length,temp2.length); i++){
        const num1 = i < temp1.length ? Number(temp1[i]) :0;
        const num2 = i < temp2.length ? Number(temp2[i]) :0;

        if(num1 > num2) 
            {
        console.log(num1,num2);

                return 1;
            }
        else if(num1 < num2) return -1;
    }
    return 0;
};

// 去除前导0
const removeZero = (str:string)=>{
    let i = 0; //记录前导0位置
    for (i = 0; i < str.length; i++){
        if(str.charAt(i) !== "0") break;
        
    }
    return str.substring(i);
}