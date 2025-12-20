type ToBeOrNotToBe = {
    toBe: (val: any) => boolean;
    notToBe: (val: any) => boolean;
};

function expect(val: any): ToBeOrNotToBe {
    return {
        toBe: function(val1): boolean{
            if(val!==val1) throw new Error("Not Equal");
            return true;
        },
        notToBe: function(val1):boolean {
            if(val===val1) throw new Error("Equal");
            return true;
        }
    }
};



console.log(() => expect(5).notToBe(null))