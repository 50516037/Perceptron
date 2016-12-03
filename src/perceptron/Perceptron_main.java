/*
 * 19~27�s�̕����ŁAi��150�ɂȂ�O�ɏ����𖞂������烋�[�v���I������悤�ɂ��܂����B
 * OR���Z�̂Ƃ���nu��0.5�𒴂����烋�[�v���I�������̂ɑ΂��āAAND���Z�̂Ƃ���nu��0.5�������������
 * ���[�v���I�������B
 * ���̉��Z�q�ł������Ă݂��Ƃ���NAND�ANOR�AXOR�ł̓��[�v���~�܂�Ȃ������B
 * �����͐��`���ʕs�\�Ȗ��ł��邱�Ƃ��킩��B
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
