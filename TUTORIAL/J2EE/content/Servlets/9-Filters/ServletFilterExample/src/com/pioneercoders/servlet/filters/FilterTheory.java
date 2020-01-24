package com.pioneercoders.servlet.filters;

public class FilterTheory {
	/*
	 *     Filters are compontents that you can use and configure to perform some filtering tasks. 
	 *     Filter is used for pre-processing of requests and post-processing of responses. 
	 *     You can have any number of filters for pre-processing of a request and post-processing of a response. 
	 *     Filters are configured in the deployment descriptor of a web application.
	 * 
	 *     How Filters Works?

           When a request reaches the Web Container, it checks if any filter has URL patterns that matches the requested URL.
           The Web Container locates the first filter with a matching URL pattern and filter's code is executed.
           If another filter has a matching URL pattern, its code is then executed. This continues until there are no filters with matching URL patterns left.
           If no error occurs, the request passes to the target servlet. Hence we know, that the request will be passed to the target servlet only when all the related Filters are successfully executed.
           The servlet returns the response back to its caller. The last filter that was applied to the request is the first filter applied to the response.
           At last the response will be passed to the Web Container which passes it to the client.
	 * 
	 * 
	 *     More about Filter API

           Filter API is part of Servlet API. Filter interface is found in the javax.servlet package.

           For creating a filter, we must implement Filter interface. Filter interface gives the following life cycle methods for a filter:

           void init(FilterConfig filterConfig): invoked by the web container to indicate to a filter that it is being placed into service.
           void doFilter(ServletRequest request, ServletResponse response, FilterChain chain): invoked by the container each time a request/response pair is passed through the chain due to a client request for a resource at the end of the chain.
           void destroy(): invoked by the web container to indicate to a filter that it is being taken out of service.
	 * 
	 * 
	 * 
	 *    First filter recieves the request and authenticate and based on the url pattern pass the request to Servlet here it is passing to LoginServlet 
	 * 
	 * 
	 * 
	 */

}
