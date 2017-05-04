package test.whx.com;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class CharacterEncodingFilter
 */
@WebFilter(description = "My first Filter", urlPatterns = { "/*" })
public class CharacterEncodingFilter implements Filter {
	// �ַ����루��ʼ��������
	protected String encoding = null;

	// FilterConfig����
	protected FilterConfig filterConfig = null;

	/**
	 * Default constructor.
	 */
	public CharacterEncodingFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// �ͷ���Դ
		encoding = null;
		filterConfig = null;
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// �ж��ַ����Ƿ���Ч
		if (encoding != null) {
			request.setCharacterEncoding(encoding);
			response.setContentType("text/html;charset = " + encoding);
		}

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// ��filterConfig��ֵ
		filterConfig = fConfig;

		// �Գ�ʼ��������ֵ
		encoding = fConfig.getInitParameter("encoding");
	}

}
