
public class Triangle extends Rectangle {
	float a;
	Triangle(int v,int u)
	{
		super(u,v);
	}
	float getTriangle()
	{
		a=(float)1/2*l*b;
		return(a);
	}
}
