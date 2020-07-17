project_name = "heimdalfront-psicoguia"
repo = "https://github.com/Teloggy/Heimdal-Front.git"
repo_name = "heimdalfront-psicoguia"

pipelineJob (project_name){
    definition{
	triggers{
	    scm('0 */2 * * *')
	}
	cpsScm{
	    scm{
		git{    		    
		    remote{
			name(repo_name)
			url(repo)
			refspec(null)
		        credentials('yaher-teloggy-easy')
		    }
		    branches('master')		    
                }
		scriptPath("Jenkinsfile")
	    }
	}
    }
}