/*
 * 19~27行の部分で、iが150になる前に条件を満たしたらループを終了するようにしました。
 * OR演算のときはnuが0.5を超えたらループが終了したのに対して、AND演算のときはnuが0.5を下回った時に
 * ループが終了した。
 * 他の演算子でも試してみたところNAND、NOR、XORではループが止まらなかった。
 * これらは線形識別不可能な問題であることがわかる。
*/
package perceptron;

public class Perceptron_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nu[] = {0.6, 0.2};
		Perceptron_lib plib = new Perceptron_lib(2,nu,0.01,0.5);
		
		double input[][] = {{1,1}, {1,0}, {0,1}, {0,0}};
		double output[] = {1, 0, 0, 0 };
		
		int index;
		int i = 0;
		
		do{
			index = (int)(Math.random()*4);
			plib.getParameter(input[index], output[index]);
			System.out.println("index : "+i+"nu = "+nu[0]+", "+nu[1]);
			if(plib.getOutput(input[0])== output[0]&&plib.getOutput(input[1])== output[1]&&plib.getOutput(input[2])== output[2]&&plib.getOutput(input[3])== output[3]){
				break;
			}
			i++;
		} while (i<=150) ;
		
		for( i = 0; i < output.length; i++){
			if(plib.getOutput(input[i])== output[i])
				System.out.println("Correct!: input("+input[i][0]+","+input[i][1]+")to output ("+output[i]+")");
		}
		
		System.out.println("Check : nu = "+nu[0]+","+nu[1]);
	}

}
