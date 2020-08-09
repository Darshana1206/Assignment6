package Assignment_6

object caseclass {
  def main(args:Array[String])={
    val p1= Point(2,3)
    val p2= Point(5,7)
    println("p1="+p1)
    println("p2="+p2)
    
    val p3= (p1+p2)
    println("Q1 Answer:Add two points="+p3)
    
    val p4=p1.move(2,3)
    println("Q2 Answer:move a point to given distence="+p4)
    
    val p5=p2.distence(p1)
    println("Q3 Answer:distence among two points="+p5)
    
    val p6= p2.invert()
    println("Q4 Answer:invertion of p2="+p6)
    
    
  }
  case class Point(a:Int,b:Int){
    def x:Int=a
    def y:Int=b
    
    //Add function
    def +(that:Point)=(this.x+that.x,this.y+that.y)
    //move function
    def move(dx:Int,dy:Int)=(this.x+dx,this.y+dy)
     // Find distence
    def distence(that:Point):Double=scala.math.sqrt((scala.math.pow(this.x-that.x, 2))+(scala.math.pow(this.y-that.y, 2)))
    //Invertion
    def invert()=Point(this.y,this.x)
  }
}