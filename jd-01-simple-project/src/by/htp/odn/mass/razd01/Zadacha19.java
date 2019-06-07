package by.htp.odn.mass.razd01;

import java.util.Random;

public class Zadacha19 {

	public static void main(String[] args) {
		int[]mass=new int[100];
		int x=0;
		int y=0;
		int w=0;
		int[]mass1=new int[100];
		int[]mass2=new int[100];
		Random rand=new Random();
		for(int i=0;i<mass.length;i++)
		{mass[i]=rand.nextInt(10);
		System.out.print(mass[i]+" ");
		}
		System.out.println();
		for(int i=0;i<mass.length;i++)
			{for(int p=0;p<mass.length;p++)
				{if(mass[i]==mass[p])
					{mass1[y]=mass[i];//записывает рассчитываемый элемент во второй массив
					mass2[y]=x;//записывает количество повторений в третий массив
					x=x+1;//считает количество повторений
					}
				
				}
			System.out.println("элемент массива - "+mass1[y]+" - повторяется "+mass2[y]+" раз");
			y=y+1;
			x=0;
			}
		for(int i=0;i<mass1.length;i++)
		{for(int k=0;k<mass1.length;k++)
			{if(mass2[k]>mass2[i])
				{if(x<mass2[k]) {x=mass2[k];
				w=mass1[k];}
				}
			else {if(x<mass2[i]) 	{x=mass2[i];
									w=mass1[i];	}
			}
			}
		}
		System.out.println("чаще всего встречается - "+w+" -- "+x+" раз");
		}

	}
