package servlets;

import com.chilun.fruit.dao.FruitDAO;
import com.chilun.fruit.dao.impl.FruitDAOImpl;
import com.chilun.fruit.pojo.Fruit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther 齿轮
 * @create 2022-05-04-10:22
 */
public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //post方式下，设置编码，防止乱码
        //设置编码必须在所有获取参数动作之前
        //got方式通过将字符串打乱成字节数组再按照设定编码重新组装成字符串
        request.setCharacterEncoding("UTF-8");
        String fName = request.getParameter("fName");
        String priceStr = request.getParameter("price");
        int price = Integer.valueOf(priceStr);
        String fCountStr = request.getParameter("fCount");
        int fCount = Integer.valueOf(fCountStr);
        String remark = request.getParameter("remark");
//        System.out.println("fName = " + fName);
//        System.out.println("price = " + price);
//        System.out.println("fCount = " + fCount);
//        System.out.println("remark = " + remark);
        FruitDAO fruitDAO = new FruitDAOImpl();
        boolean flag = fruitDAO.addFruit(new Fruit(0, fName, price, fCount, remark));
        System.out.println(flag?"添加成功":"添加失败");
    }
}
